(ns project-euler-clojure.problem3-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.problem3 :refer :all]))

;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143 ?

(deftest Problem3
  (is (= (prime-factors 13195) 29))
  ;(is (= (prime-factors 600851475143) 6857))
)
