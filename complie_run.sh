rm *Lexer.py *.tokens *Parser.py *Visitor.py
antlr4 -Dlanguage=Python3 -visitor -no-listener simplex.g4
python simplex.py test.b