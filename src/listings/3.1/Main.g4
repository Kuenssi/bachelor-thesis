file: workflows+ ;

workflows: workflow NEWLINE eventNote* ;

eventNote: ( normalNote | extendedNote | page) NEWLINE? ;
