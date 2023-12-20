package PdfWordExtraction;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfWordExtractor {

	public static void main(String[] args) {
		try {
			// Replace "path/to/your/document.pdf" with the actual path to your PDF file
			File pdfFile = new File(
					"C:\\Users\\Ninad\\Downloads\\12-20-2023 Live Indian accd 2023 Let's Talk! Report (1).pdf");

			// Load the PDF document
			PDDocument document = PDDocument.load(pdfFile);

			// Create a PDFTextStripper object
			PDFTextStripper textStripper = new PDFTextStripper();

			// Get the text content from the PDF
			String text = textStripper.getText(document);

			// Print the extracted text
			System.out.println("Extracted Text: \n" + text);

			// Close the PDF document
			document.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
