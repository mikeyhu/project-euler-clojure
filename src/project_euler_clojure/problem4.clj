(ns project-euler-clojure.problem4)

;(load "problem4")
;(in-ns 'project-euler-clojure.problem4)

(defn palindromic? [number]
  (let [ x (seq (str number))
         y (reverse x) ]
    (= x y)
  )
)

(defn largest-palindrome-up-to [number]
  (take 1 (filter palindromic? (sort > (distinct (flatten (map up-to (range number)))))))
)

(defn up-to [number]
  (map #(* number %) (range number))
)
