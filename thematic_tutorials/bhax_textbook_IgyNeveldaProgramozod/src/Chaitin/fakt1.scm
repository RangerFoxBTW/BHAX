(define (fakt n)
    (define (iter osszeg hatar)
    (if (> hatar n)
        osszeg(iter (* hatar osszeg) (+ hatar 1))))
(iter 1 1))