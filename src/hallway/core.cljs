(ns hallway.core)

(enable-console-print!)

(println "hello world")

(let [canvas (.getElementById js/document "canvas")]
  (set! (.-width canvas) (.-innerWidth js/window))
  (set! (.-height canvas) (.-innerHeight js/window)))

(defn draw-box
  [color box-x box-y]
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")]
    (set! (.-fillStyle ctx) color)
    (.fillRect ctx box-x box-y 100 100)))

(defn erase-ctx
	[]
	(let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")]
	(.clearRect ctx 0 0 (.-innerWidth js/window) (.-innerHeight js/window))))

(defn animate-box
	[init-x init-y timeout]
	(when (< init-x (-(.-innerWidth js/window) 100))
		(erase-ctx)
		(draw-box "blue" init-x init-y)
		(js/setTimeout #(animate-box (inc init-x) init-y timeout) timeout)))