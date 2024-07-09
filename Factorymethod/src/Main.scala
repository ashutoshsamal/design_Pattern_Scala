import LLD.FactoryMethod
import LLD.FactoryMethod.{SparkReaderFactory, faultyFactory}

object Main {
  def main(args: Array[String]): Unit = {

    val factory=new SparkReaderFactory()
    val faultFactoy=new faultyFactory()

    val reader=factory.getInstanceOfReader("csv")
    reader.read()

    val faultreader=faultFactoy.getInstanceOfReader("csv")
    faultreader.read()

  }
}