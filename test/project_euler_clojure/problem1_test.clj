(ns project-euler-clojure.problem1-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.problem1 :refer :all]))

(deftest Problem1
  (is (= (sum-of-multiples 10  ) 23))
  (is (= (sum-of-multiples 1000) 233168))
)
