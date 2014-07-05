(ns project-euler-clojure.problem4)

(defn palindromic? [number]
  (let [ x (seq (str number))
         y (reverse x) ]
    (= x y)
  )
)

(defn up-to [number]
  (map #(* number %) (range number))
)

(defn largest-palindrome-up-to [number]
  (first (filter palindromic? (sort > (distinct (flatten (map up-to (range number)))))))
)
