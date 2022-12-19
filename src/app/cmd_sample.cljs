(ns app.cmd-sample)

(def cmd
  {:test-items [[{:cmd "test-case"
                  :alias "online-ls64x2"
                  :action "mode-change"
                  :mode "online"
                  :sensors [{:id 31
                             :sub-id "first"}
                            {:id 31
                             :sub-id "second"}]
                  :play-time {:unit :minute  ;;:hour :minute :second
                              :time 2}}]
                [{:cmd "test-case"
                  :alias "offline-ls64x2"
                  :action "mode-change"
                  :mode "offline"
                  :sensors [{:id 31
                             :sub-id "first"}
                            {:id 31
                             :sub-id "second"}]
                  :log-path ["D:/data/viewsystem-log/cb64s1_cb64s1-modify/221123/Bin/2022_11_23_19_21_54.bin"]
                  :repeat :random
                         ;;on each log play time
                  :play-time {:unit :second
                              :time 360}}]]
  ;;  :sequence {:mode "sequential"
  ;;             :repeat :3 
              ;; :case ["online-ls64x2" "offline-ls64x2"]}
   :sequence [{:mode :random
               :repeat :unlimit
               :case ["online-ls64x2" "offline-ls64x2"]}]})
