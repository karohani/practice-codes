#lang planet neil/sicp
;; 1.3 3개의 숫자를 받아 그 가운데 큰 숫자 두 개를 제공한 다음 그 두 값을 덧셈하여 내놓는 함수를 구현하라. 
(define (max-square x y z)
  (cond
    ((and (> x y) (> y z)) (+ (* x x) (* y y)))
    ((and (> x z) (> z y)) (+ (* x x) (* z z)))
    ((and (> y z) (> z x)) (+ (* y y) (* z z)))
    ((and (> y x) (> x z)) (+ (* y y) (* x x)))
    ((and (> z x) (> x y)) (+ (* z z) (* x x)))
    ((and (> z y) (> y x)) (+ (* z z) (* y y)))
    )
  )

;; (x y z) (x z y) (y z x) (y x z) (z x y) (z y x)

(max-square 1 2 3)
