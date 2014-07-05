(ns project-euler-clojure.problem1)

(defn multiple? [n c] (= (mod n c) 0))

(defn multiples-of-3-5 [numbers]
  (filter #(or (multiple? % 3) (multiple? % 5)) numbers)
)

(defn sum-of-multiples [n]
  (reduce + (multiples-of-3-5 (range n)))
)
