//Superset Id: 6385480
interface Document {
    abstract void open();
}

abstract class DocumentFactory {
    abstract Document createDocument();
}

interface WordDocument extends Document {
}

class WordDocumentClass implements WordDocument {
    public void open() {
        System.out.println("Opening a word document");
    }
}

class WordDocumentFactory extends DocumentFactory {
    public WordDocumentClass createDocument() {
        System.out.println("Creating a word document");
        return new WordDocumentClass();
    }
}

interface PdfDocument extends Document {
}

class PdfDocumentClass implements PdfDocument {
    public void open() {
        System.out.println("Opening a pdf document");
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public PdfDocumentClass createDocument() {
        System.out.println("Creating a pdf document");
        return new PdfDocumentClass();
    }
}

interface ExcelDocument extends Document {
}

class ExcelDocumentClass implements ExcelDocument {
    public void open() {
        System.out.println("Opening a excel document");
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public ExcelDocumentClass createDocument() {
        System.out.println("Creating a excel document");
        return new ExcelDocumentClass();
    }
}

class FactoryMethodPattern {
    public static void main(String args[]) {
        DocumentFactory worddocs = new WordDocumentFactory();
        Document word = worddocs.createDocument();
        word.open();
        DocumentFactory pdfdocs = new PdfDocumentFactory();
        Document pdf = pdfdocs.createDocument();
        pdf.open();
        DocumentFactory exceldocs = new ExcelDocumentFactory();
        Document excel = exceldocs.createDocument();
        excel.open();
    }
}
