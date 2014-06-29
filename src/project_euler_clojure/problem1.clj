(ns project-euler-clojure.problem1)

(defn numbers-up-to [n] (take n (range)))

(defn multiples-of-3-5 [numbers]
  (filter #(or (=(mod % 3) 0) (=(mod % 5) 0)) numbers)
  )

(defn sum-of-multiples [n]
  (reduce + (multiples-of-3-5 (numbers-up-to n)))
  )
