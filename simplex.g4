grammar simplex;

iniciar : programa;

// GRAMATICAS

// programa para calculo
programa : expresion* EOF;

// tipos de expresiones validas
expresion : identificador IGUAL expMAT # asignar
          | expMAT # calcular
          | IMPRIMIR PARABIERTO expresion PARCERRADO # imprimirExpr
          | SALTOLINEA # saltar
          | problema # problemasExpresados
          | COMENTARIO # comentarios
          ;

// Definicion de problema para solucio+n con el metodo simplex
problema: funcionTrans+ restriccion restricionVariable RESOLVER SALTOLINEA # problemas
        ;

restricionVariable : CON DOSPUNTOS SALTOLINEA (desigualdadVariable SALTOLINEA)+ #restriccionesVariables ;

desigualdadVariable : variable IGUAL expMAT # desigualdadesVariables
                    | variable mayorIgual expMAT # desigualdadesVariablesMayorIgual
                    | variable menorIgual expMAT # desigualdadesVariablesMenorIgual
                    ;

restriccion : RESTRICCIONES DOSPUNTOS SALTOLINEA (desigualdad SALTOLINEA)+ #restricciones;

desigualdad: polinomio IGUAL expMAT # desigualdades
           | polinomio mayorIgual expMAT # desigualdadesMayorIgual
           | polinomio menorIgual expMAT # desigualdadesMenorIgual
           ;


funcionTrans: operacion = (MAXI | MINI) DOSPUNTOS SALTOLINEA funcion SALTOLINEA #funcionTransf;

funcion : funcionDef IGUAL polinomio # funciones;

funcionDef: FUNCION PARABIERTO variable (COMA variable)* PARCERRADO # definirFuncion
          ;

polinomio : MENOS monomio monomioAdd+ # menosPolinomios
          | MENOS monomio # menosMonPolinomios
          | monomio monomioAdd+ # polinomios
          | monomio # monPolinomios
          ;

monomioAdd: MAS monomio # masMonomio
          | MENOS monomio # menosMonomio
          ;

monomio : numero variable # monomioMinimo
        | expMAT # numeroMonomio
        ;

// Expresiones matematicas
expMAT: expMAT POTENCIA expMAT # operPotencia
      | expMAT operador = (MULT | DIV) expMAT # operMult
      | expMAT operador = (MAS | MENOS) expMAT # operSuma
      | PARABIERTO expMAT PARCERRADO # operMatematicaParentesis
      | entero # numeros
      | decimal # decimales
      | identificador # identificadores
      | MENOS expMAT # menosExpMAT
      | trigonometrica # trigonometricas
      ;
// Variables para expresiones lineales
variable : LETRA+ # variables;

// Identificadores de variables de usoa en el programa
identificador : LETRA (LETRA | DIGITO | '_')*;

// Numero para usar en expresiones lineales
numero : PARABIERTO expMAT PARCERRADO # expresionMatematica
       | decimal # decimalesPol
       | entero # numerosPol
       | # noNumero
       ;

trigonometrica : SENO PARABIERTO expMAT PARCERRADO # senos
               | COSENO PARABIERTO expMAT PARCERRADO # cosenos
               | TANGENTE PARABIERTO expMAT PARCERRADO # tangentes
               | EULER PARABIERTO expMAT PARCERRADO # eulerianos
               | LOGARITMO PARABIERTO expMAT PARCERRADO # logaritmos
               ;

// Expresiones numericas
decimal : entero PUNTO entero # decimalesPuros
        | decimal exponencial # decimalesCientificos
        | entero exponencial # entrosCientificos
        ;
exponencial : EXPONENCIAL entero # exponencialesUS
            | EXPONENCIAL MENOS entero # exponencialesNegativos
            | EXPONENCIAL MAS entero # exponencialesPositivos
            ;

entero : DIGITO+;

// DEFINICIONES

// Operadores
mayorIgual: MAYOR IGUAL;
menorIgual: MENOR IGUAL;
MAS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
POTENCIA : '**';
PUNTO : '.';
IGUAL : '=';
LETRA : [a-zA-Z];
COMA : ',';
SALTOLINEA :'\r'? '\n';
BLANCO : [ \t]+ -> skip ;
DIGITO : [0-9];
PARABIERTO : '(';
PARCERRADO : ')';
MAYOR: '>';
MENOR: '<';
DOSPUNTOS: ':';
EXPONENCIAL: [Ee];

// Palabras reservadas
IMPRIMIR : 'imprimir' | 'imp' ;
MAXI : 'maximizar' | 'max';
MINI : 'minimizar' | 'min';
FUNCION: 'funcion'|'fun';
RESTRICCIONES: 'restringir' | 'restr';
RESOLVER: 'resolver' | 'resol' | 'res' ;
CON: 'con';
SENO: 'sen';
COSENO: 'cos';
TANGENTE: 'tan';
EULER: 'exp';
LOGARITMO : 'ln';

//Comentarios
COMENTARIO : ('#' ~[\r\n]*  | '##' .*? '##') -> skip;
