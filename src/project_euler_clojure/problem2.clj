(ns project-euler-clojure.problem2)

(defn fib-list-to
  ([highest]
    (concat [1] (fib-list-to highest 1 1)))
  ([highest n t]
    (let [tot (+ t n)]
      (if (< tot highest)
        (concat [tot] (fib-list-to highest tot n))
        nil
      )
    )
  )
)

(defn sum-even-fib-up-to [n]
  (reduce +
    (filter
      #(= (mod % 2) 0)
      (fib-list-to n)
    )
  )
)
