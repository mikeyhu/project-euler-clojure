(ns project-euler-clojure.problem4-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.problem4 :refer :all]))

;A palindromic number reads the same both ways.
;The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;Find the largest palindrome made from the product of two 3-digit numbers.

(deftest Problem4
  (is (= (largest-palindrome-up-to 100 ) 9009  ))
  (is (= (largest-palindrome-up-to 1000) 906609))
)
