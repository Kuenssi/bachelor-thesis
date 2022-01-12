grammar AntlrExample;

file: prop+ ;
prop: ID '=' value '\n' ;
value: STRING | ID ;

ID: [a-zA-Z]+ ;
STRING: '"' .*? '"' ;
WS : [ \t]+ -> skip ;