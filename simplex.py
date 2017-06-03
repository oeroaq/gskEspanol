import sys
from antlr4 import *
from simplexLexer import simplexLexer
from simplexParser import simplexParser
from simplexExpand import simplexExpand


def main(argv):
    if len(argv)>1:
        input = FileStream(argv[1])
        lexer = simplexLexer(input)
        stream = CommonTokenStream(lexer)
        parser = simplexParser(stream)
        tree = parser.iniciar()
        #lisp_tree_str = tree.toStringTree(recog=parser)
        #print(lisp_tree_str)
        visitor = simplexExpand()
        visitor.visit(tree)
    else:
        print("Uso: \n\t python simplex.py <file> \n")
if __name__ == '__main__':
    main(sys.argv)
