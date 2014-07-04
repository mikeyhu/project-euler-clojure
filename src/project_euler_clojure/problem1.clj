(ns project-euler-clojure.problem1)

; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple? [n c] (= (mod n c) 0))

(defn multiples-of-3-5 [numbers]
  (filter #(or (multiple? % 3) (multiple? % 5)) numbers)
)

(defn sum-of-multiples [n]
  (reduce + (multiples-of-3-5 (range n)))
)
