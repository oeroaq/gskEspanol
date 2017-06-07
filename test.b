x=2
min:
    funcion (x,y)= (-2*x)x-5y
restringir:
    (x)x+y <= 3
    x+(x)y <= 3
con:
    x >= 0
    y >= 0
res

max:
    funcion (x,y,z,w) = 20000x+20000y+20000z+20000w
restringir:
    2x+y+z+2w <= 24
    2x+2y+z <= 20
    2z+2w <= 20
    4w <= 16
con:
    x >= 0
    y >= 0
    z >= 0
    w >= 0
res

max:
    funcion (a,b,c,d,e) = 3a+2b-5c-2d+3e
restringir:
    a+b+c+2d+e <= (4)
    7a+3c-4d+3e <= 8
    11a-6b+3d-3e >= 3
con:
    a >= 0
    b >= 0
    c >= 0
    d >= 0
    e >= 0
res

max:
    funcion (a,b) = 50a+80b
restringir:
    a+2b <=120
    a+b <=90
con:
    a >= 0
    b >= 0
res

max:
    funcion (a,b) = 3.2a+2.4b
restringir:
    8a+5b <=200
    5a+4b <=140
    5a+7b <=175
con:
    a >= 0
    b >= 0
res
