from cvxopt import glpk
from cvxopt.base import matrix as m

c = m([-20000., -20000., -20000., -20000.])
A = m([[2.,1.,1.,2.], [2.,2.,1.,0.], [0.,0.,2.,2.], [0.,0.,0.,4.]])
b = m([24., 20.,20., 16.])
intVars = range(4)  # Especificamos que las 5 variables son enteras
binVars = range(4)  # Especificamos que las 5 variables son binarias
sol = glpk.ilp(c, A, b, I=set(intVars), B=set(binVars))
print('Los valores optimos de las variables son: {0}\n'.format(sol[1]))
if sol[0] == 'optimal':
    print('El valor optimo es {0}'.format((-c.T * sol[1])[0]))
    # El valor optimo debemos transponerlo y cambiarle el signo, estamos maximizando.
else:
    print(
        'El problema no devolvio una solucion optima. El estado del solucionador fue {0}'.format(sol[0]))
