// Define a grammar called main
grammar Skret;
program: 'main' subprogram func*;

RETURN: ('return' WS ID)| 'return';
FUNK: 'havefun';
RANGE: 'range' ;
OP: '+'|'-'|'*'|'/';
ADD: 'add';
DELETE: 'delete';
TYPE: '['('element'|'list'|'int'|'string'|'boolean')']'|'[]';
STREAM_OP: (IN|OUT) WS;
ELEMENT_POINTER: DOT NUM;
BINARY_OP: WS (DELETE|ADD);
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NUM: [0-9]+ ;
ID : [a-zA-Z]+ NUM* ELEMENT_POINTER?;             // match lower-case identifiers
PARAM: TYPE WS? ID;
COMPARE_OP: '=='|'<>'|'>'|'<';
ASSIG: '=';
LANDING: '_';
DOT: '.';
IF: '?';
ELSE: 'else';
IN: 'in';
OUT: 'out';

subprogram: '<' (statement)* RETURN ';' '>';
func: FUNK PARAM '(' PARAM? (','PARAM)*')' subprogram;
statement: WS? (block|io|var_define|landing_expression|var_action|func_call) ';';

block: (for_block|if_block) '<'statement*'>';
for_block: RANGE ID WS? '->' WS? (NUM| ID );
if_block: '?' '(' math_expression COMPARE_OP math_expression ')';

func_call: ID '(' math_expression? (',' math_expression )* ')';

var_action: ID (var_reform|binary_expression);
binary_expression: BINARY_OP  math_expression;
var_reform: ASSIG math_expression;

io: STREAM_OP math_expression;

landing_expression: LANDING ID OP math_expression;
math_expression:
    typeCast
    | inBrackets
    | math_expression OP math_expression
    | have_value
    ;
typeCast: '(' TYPE ')' math_expression;
inBrackets: '('math_expression')';

var_define: PARAM|PARAM ASSIG (math_expression|list_special_define);
have_value: ID|NUM;
list_special_define: '{' (NUM)+ '}';