(ns project-euler-clojure.problem2)

(defn fib
  ([] (fib 1 2))
  ([a b] (cons a (lazy-seq (fib b (+ a b)))))
)

(defn sum-even-fib-up-to [n]
  (reduce +
    (filter
      #(= (mod % 2) 0)
      (take-while (partial > n) (fib))
    )
  )
)
