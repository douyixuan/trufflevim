grammar Vimscript;

script: statement+ ;
statement: assignment | functionCall | controlStructure ;
assignment: IDENTIFIER '=' expression ;
functionCall: IDENTIFIER '(' (expression (',' expression)*)? ')' ;
controlStructure: 'if' expression 'then' statement+ 'endif' ;
expression: IDENTIFIER | NUMBER | STRING | functionCall ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER: [0-9]+ ;
STRING: '"' .*? '"' ;
WS: [ \t\r\n]+ -> skip ;