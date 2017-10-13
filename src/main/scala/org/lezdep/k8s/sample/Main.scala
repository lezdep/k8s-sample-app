package org.lezdep.k8s.sample

object Main {
  def main(args: Array[String]): Unit = {
    while (true) {
      println("Hello from K8S sample app deployed via Spinnaker pipeline")
      Thread.sleep(20000)
    }
  }
}
