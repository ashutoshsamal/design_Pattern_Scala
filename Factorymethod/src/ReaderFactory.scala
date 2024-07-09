package LLD.FactoryMethod


trait ReaderFactory {
  def getInstanceOfReader(ReaderType:String):Reader

}

class SparkReaderFactory extends ReaderFactory {

  override def getInstanceOfReader(ReaderType: String): Reader = {
    ReaderType.toUpperCase match {
      case "CSV" => new csvReader()
      case "JSON" => new jsonReader()
      case _ => throw new RuntimeException("##### "+ReaderType+" Is Not Supported ##### ")
    }

  }

}

class faultyFactory extends ReaderFactory{
  override def getInstanceOfReader(ReaderType: String): Reader = {
    ReaderType.toUpperCase match {
      case "JSON" => new csvReader()
      case "CSV" => new jsonReader()
      case _ => throw new RuntimeException("##### "+ReaderType+" Is Not Supported ##### ")
    }
  }

}
