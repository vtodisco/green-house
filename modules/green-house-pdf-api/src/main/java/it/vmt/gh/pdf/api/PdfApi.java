package it.vmt.gh.pdf.api;

/**
 * @author todisco
 */
public interface PdfApi {
	
	public void generateTestPdf(String destination) throws Exception;
	
	public long generateUserOffer(String cartJsonString) throws Exception;

	public long generateUserInvoice(String cartJsonString) throws Exception;
}