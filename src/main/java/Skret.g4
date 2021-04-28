// Define a grammar called main
grammar Skret;
program: 'main' subprogram func*;

RETURN: ('return' WS ID)| 'return';
PARAM: TYPE WS? ID;
ID : [a-z]+ NUM* ELEMENT_POINTER?;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NUM: [0-9]+ ;
TYPE: '['('element'|'list'|'int'|'string'|'bool')']'|'[]';
OP: '+'|'-'|'*'|'\\';
ADD: 'add';
DELETE: 'delete';
BINARY_OP: WS (DELETE|ADD);
COMPARE_OP: '=='|'<>'|'>'|'<';
ASSIG: '=';
LANDING: '_';
DOT: '.';
RANGE: 'range' ;
IF: '?';
ELSE: 'else';
IN: 'in';
OUT: 'out';
STREAM_OP: (IN|OUT) WS;
ELEMENT_POINTER: DOT NUM;

subprogram: '<' (statement)* RETURN ';' '>';

statement: WS? (block|io|var_define|landing_expression|var_action|func_call) ';';

block: (if_block|for_block) '<'statement*'>';
for_block: RANGE ID '->' (NUM| ID );
if_block: '?' '(' math_expression COMPARE_OP math_expression ')';

func_call: ID '(' math_expression (',' math_expression )* ')';

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

func: 'havefun' PARAM '(' PARAM? (','PARAM)*')' subprogram;