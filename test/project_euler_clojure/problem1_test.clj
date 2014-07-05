(ns project-euler-clojure.problem1-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.problem1 :refer :all]))

; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(deftest Problem1
  (is (= (sum-of-multiples 10  ) 23))
  (is (= (sum-of-multiples 1000) 233168))
)
