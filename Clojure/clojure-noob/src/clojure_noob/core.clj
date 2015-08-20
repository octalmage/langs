(ns clojure-noob.core
    (:use seesaw.core)
    (:gen-class))
  
(defn htmlalert
    [event]
    (alert event
        (str "<html>Hello from <b>Clojure</b>. ")))

(defn -main [& args]
    native!
    (invoke-later
        (-> (frame  
                :title "Hello",
                :content 
                    (grid-panel
                        :border "Properties"
                        :columns 3
                        :items  ["Name" (text "Bob") ""
                                "Address" 
                                    (text "123 Main St")
                                    (button :text "Save" :listen [:action htmlalert]) ] ),
                :on-close :exit)
     pack!
     show!)))