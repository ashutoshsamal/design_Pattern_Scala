import LLD.FactoryMethod
import LLD.FactoryMethod.SparkReaderFactory

object Main {
  def main(args: Array[String]): Unit = {

    val reader=SparkReaderFactory.getInstanceOfReader("csvfd")
    reader.read()

  }
}