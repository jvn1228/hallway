(ns hallway.core)

(enable-console-print!)

(println "hello world")

(let [canvas (.getElementById js/document "canvas")
	  win-width (.-innerWidth js/window)
	  win-height (.-innerHeight js/window)]
  (set! (.-width canvas) win-width)
  (set! (.-height canvas) win-height))

(defn draw-box
  [color box-x box-y]
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")]
    (set! (.-fillStyle ctx) color)
    (.fillRect ctx box-x box-y 100 100)))

