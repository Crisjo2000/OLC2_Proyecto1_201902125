```
< programa > ::= < stmt >+

< stmt > ::= < decl_stmt >
         | < assign_stmt >
         | < if_stmt >
         | < loop_stmt >
         | < func_call >
         | < func_dcl >
         | < struct_dcl >
         | < struct_inst >
         | < transfer_stmt >
         | < io_stmt >
         | < incredecre >
         | < switch_stmt >
         | < array_stmt >

< decl_stmt > ::= "mut" ID (":" < var_type >)? "=" < expresion >
              | "const" ID ":" < var_type > "=" < expresion >

< assign_stmt > ::= < id_pattern > ("=" | "+=" | "-=" | "*=" | "/=") < expresion >

< if_stmt > ::= "if" < expresion > < block > ("else" (< if_stmt > | < block >))?

< loop_stmt > ::= "while" < expresion > < block >
              | "for" ID "in" (< expresion > | < range >) < block >
              | "for" < assign_stmt >? ";" < expresion >? ";" < incredecre >? < block >

< switch_stmt > ::= "switch" < expresion > < block > < case_clause >+ < default_clause >?

< case_clause > ::= "case" (< expresion > ("," < expresion >)*) ":" < stmt >*

< default_clause > ::= "default" ":" < stmt >*

< block > ::= "{" < stmt >* "}"

< func_dcl > ::= "fn" ID "(" < params >? ")" (":" < var_type >)? < block >

< params > ::= < param > ("," < param >)*

< param > ::= ID ":" < var_type >

< func_call > ::= < id_pattern > "(" < args >? ")"

< args > ::= < expresion > ("," < expresion >)*

< struct_dcl > ::= "struct" ID "{" < struct_field >* "}"

< struct_field > ::= ID ":" < var_type > ("=" < expresion >)? ";"

< struct_inst > ::= ID "{" (ID ":" < expresion > ("," ID ":" < expresion >)*)? "}"

< array_stmt > ::= "[]" < var_type > "{" < expresion > ("," < expresion >)* "}"
               | ID "=" "[]" < var_type > "{" < expresion > ("," < expresion >)* "}"

< expresion > ::= < literal >
              | < id_pattern >
              | "(" < expresion > ")"
              | ("!" | "-") < expresion >
              | < expresion > ("*" | "/" | "%") < expresion >
              | < expresion > ("+" | "-") < expresion >
              | < expresion > ("<" | "<=" | ">" | ">=") < expresion >
              | < expresion > ("==" | "!=") < expresion >
              | < expresion > "&&" < expresion >
              | < expresion > "||" < expresion >
              | < func_call >
              | < expresion > "." ID
              | < expresion > "[" < expresion > "]"

< literal > ::= INT
            | FLOAT
            | STRING
            | CHAR
            | BOOL

< id_pattern > ::= ID ("." ID)*

< var_type > ::= "int"
             | "float"
             | "string"
             | "bool"
             | "char"
             | "void"
             | "[]" < var_type >
             | ID

< incredecre > ::= ID ("++" | "--" | "+=" < expresion > | "-=" < expresion >)

< transfer_stmt > ::= "return" < expresion >?
                  | "break"
                  | "continue"

< io_stmt > ::= "println" "(" (< expresion > ("," < expresion >)*)? ")"
            | "print" "(" (< expresion > ("," < expresion >)*)? ")"

< range > ::= < expresion > ".." < expresion >
```