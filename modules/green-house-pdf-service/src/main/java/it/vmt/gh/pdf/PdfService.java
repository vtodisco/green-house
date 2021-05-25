package it.vmt.gh.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.Validator;

import it.vmt.gh.pdf.api.PdfApi;

/**
 * @author todisco
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = PdfApi.class
)
public class PdfService implements PdfApi {

	// TODO enter required service methods
	public void generateTestPdf(String destination) throws Exception {
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(destination));
		document.open();
		document.add(new Paragraph("INIZIO PREVENTIVO"));
		document.add(new Paragraph("FINE PREVENTIVO"));
		document.close();
		writer.close();
	}

	@Override
	public long generateUserOffer(String envelopeJsonString) throws Exception {
		JSONObject envelopeJson = JSONFactoryUtil.createJSONObject(envelopeJsonString);
		JSONObject cartJson = envelopeJson.getJSONObject("cart");
		long userId = cartJson.getLong("userId");
		long cartId = cartJson.getLong("cartId");
		DLFileEntry dfe = null;
		FileEntry fe = null;
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy-hhmmss");
		if(userId > 0) {
			User user = UserLocalServiceUtil.fetchUser(userId);
			File offer = FileUtil.createTempFile();
			Document document = new Document(PageSize.A4);
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(offer));
			document.open();
			Image logo = Image.getInstance(new URL("https://manager.ghouse2020.it/documents/38604/39355/banner-normal.png/57caaf5e-0742-c20c-7474-82eee134943d?t=1620677214114"));
			logo.scaleToFit(2032, 89);
			logo.setAbsolutePosition(27, 720);
			Paragraph header = new Paragraph();
			header.add(logo); 
			header.add(new Chunk(logo, 0, 0, true)); 
			_log.info("LEADING: " + header.getLeading());
			document.add(header);
			Paragraph personalData = new Paragraph();
			personalData.add(new Chunk("1. DATI CLIENTE"));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("TIPOLOGIA CLIENTE: PRIVATO"));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("COGNOME: " + user.getLastName()));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("NOME: " + user.getFirstName()));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk(
					"TELEFONO: " +
					(user.getPhones().size() > 0 ? user.getPhones().get(0).getNumber() : "") + 
					"EMAIL: " + user.getEmailAddress()));
			if(user.getAddresses().size() > 0) {
				Address address = user.getAddresses().get(0);
				personalData.add(new Chunk("2. DATI IMMOBILE"));
				personalData.add(Chunk.NEWLINE);
				personalData.add(new Chunk("INDIRIZZO: " + address.getStreet1() + ", " + address.getStreet2()));
				personalData.add(Chunk.NEWLINE);
				personalData.add(new Chunk("LOCALITA': " + address.getZip() + " (" + address.getCity() + ")"));
				personalData.add(Chunk.NEWLINE);
				personalData.add(new Chunk("PROVINCIA': " + address.getRegion().getName() + " (" + address.getCountry().getName() + ")"));
			}
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("OFFERTA"));
			personalData.add(Chunk.NEWLINE);
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Gentile " + user.getFirstName()));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("le sottopongo la nostra migliore offerta per la fornitura ed installazione dei seguenti infissi:"));
			personalData.add(Chunk.NEWLINE);
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("DESCRIZIONE FINESTRE"));
			personalData.add(Chunk.NEWLINE);
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Finestre e porte finestre in PVC, con 5 camere di isolamento, profili 100% classe A."));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Spessore delle pareti esterne minimo 3 mm."));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Rinforzo con acciaio zincato da 1,5 mm per le finestre e da 2 mm per le porte finestre."));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Doppio vetro termoisolato con gas Argon. Per le porte finestre il vetro è antiinfortunistico come da normative vigenti."));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Ferramenta Maco e Seigena con tutti i punti di chiusura antieffrazione."));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Sistema di chiusura con anta a ribalta, con microventilazione e con il meccanismo di prevenzione di azionamento errato."));
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("Colore infisso come da tabella sottostante, guarnizioni grigie. Contorni arrotondati"));
			personalData.add(Chunk.NEWLINE);
			personalData.add(Chunk.NEWLINE);
			personalData.add(Chunk.NEWLINE);
			personalData.add(Chunk.NEWLINE);
			personalData.add(new Chunk("PREVENTIVO INFISSI"));
			document.add(personalData);
			
			JSONArray items = cartJson.getJSONArray("items");
			PdfPTable table = new PdfPTable(5);
			PdfPCell cell = new PdfPCell(new Phrase("Ambiente"));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase("Tipologia"));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase("Dimensioni (LxA)"));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase("Ante"));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase("Immagine"));
			table.addCell(cell);
			cell = new PdfPCell(new Phrase("Importo"));
			table.addCell(cell);
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				JSONObject carpentry = item.getJSONObject("carpentry");
				JSONObject environment = item.getJSONObject("environment");
				cell = new PdfPCell(new Phrase(environment.getString("name")));
				table.addCell(cell);
				cell = new PdfPCell(new Phrase(carpentry.getString("name")));
				table.addCell(cell);
				cell = new PdfPCell(new Phrase(item.getString("width") + " x " + item.getString("height")));
				table.addCell(cell);
				cell = new PdfPCell(new Phrase(carpentry.getString("shutters")));
				table.addCell(cell);
				Image img = Image.getInstance(new URL(item.getString("carpentryImg")));
				img.scaleToFit(75, 75);
				cell = new PdfPCell(img);
				table.addCell(cell);
				cell = new PdfPCell(new Phrase(item.getString("price")));
				table.addCell(cell);
			}
			// TOTALE
			cell = new PdfPCell(new Phrase("TOTALE FINESTRE"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("total")));
			cell.setColspan(2);
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);
			// TRASPORTO
			cell = new PdfPCell(new Phrase("TRASPORTO"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("deliveryTotal")));
			cell.setColspan(2);
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);
			// MONTAGGIO
			cell = new PdfPCell(new Phrase("MONTAGGIO"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("installationTotal")));
			cell.setColspan(2);
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);
			//IVA
			cell = new PdfPCell(new Phrase("IVA"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("vat") + "%"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("vatTotal")));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);
			// TOTALE + IVA
			cell = new PdfPCell(new Phrase("TOTALE"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("totalWithVat")));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(2);
			table.addCell(cell);
			// SCONTO IN FATTURA
			cell = new PdfPCell(new Phrase("SCONTO IN FATTURA"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getBoolean("invoiceDiscount") ? "50%" : "NO"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("discountedTotal")));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			table.addCell(cell);

			// NETTO A PAGARE
			cell = new PdfPCell(new Phrase("NETTO A PAGARE"));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase(cartJson.getString("discountedTotal")));
			cell.setBorderWidth(1);
			cell.setBorderWidthBottom(1);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setColspan(2);
			table.addCell(cell);

			document.add(table);
			document.close();
			writer.close();
			String title = "offerta-" + cartId;
			dfe = DLFileEntryLocalServiceUtil.fetchFileEntry(user.getGroupId(), 0, title);
			if(Validator.isNotNull(dfe)) {
				File existingOffer = FileUtil.createTempFile(dfe.getContentStream());
				fe = _dlAppLocalService.addFileEntry(
						userId, 
						user.getGroupId(), 
						0, 
						"offer-" + cartId + "-" + sdf.format(Calendar.getInstance().getTime()) + ".pdf", 
						"application/pdf", 
						"copy-" + title + "-" + sdf.format(Calendar.getInstance().getTime()), 
						"Offerta", 
						null, 
						existingOffer, 
						new ServiceContext());
				existingOffer.delete();
				_dlAppLocalService.deleteFileEntry(dfe.getFileEntryId());
			}
			fe = _dlAppLocalService.addFileEntry(
					userId, 
					user.getGroupId(), 
					0, 
					"offerta-" + cartId + ".pdf", 
					"application/pdf", 
					title, 
					"Offerta", 
					null, 
					offer, 
					new ServiceContext());
		}
		return fe.getFileEntryId();
	}
	
	@Override
	public long generateUserInvoice(String cartJsonString) throws Exception {
		JSONObject cartJson = JSONFactoryUtil.createJSONObject(cartJsonString);
		long userId = cartJson.getLong("userId");
		long cartId = cartJson.getLong("cartId");
		DLFileEntry dfe = null;
		if(userId > 0) {
			User user = UserLocalServiceUtil.fetchUser(userId);
			File offer = FileUtil.createTempFile();
			Document document = new Document(PageSize.A4);
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(offer));
			document.open();
			Image logo = Image.getInstance(new URL("http://localhost:8080/documents/36502/46875/logo-normal.png/c36b2e1b-d942-8cd8-9366-4c109b18fd2b?t=1607371852895"));
			logo.scaleToFit(100, 89);
			logo.setAbsolutePosition(30, 3378);
			Paragraph header = new Paragraph();
			header.add(new Chunk(logo, 0, 0, true)); 
			document.add(header);
			document.add(new Paragraph("INIZIO PREVENTIVO"));
			JSONArray items = cartJson.getJSONArray("items");
			PdfPTable table = new PdfPTable(2);
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				JSONObject carpentry = item.getJSONObject("carpentry");
				JSONObject environment = item.getJSONObject("environment");
				table.addCell(environment.getString("name"));
				table.addCell(carpentry.getString("name"));
				table.addCell(item.getString("width") + " x " + item.getString("height"));
				table.addCell(Image.getInstance(new URL(item.getString("carpentryImg"))));
				table.addCell(item.getString("price"));
			}
			document.add(table);
			document.add(new Paragraph("FINE PREVENTIVO"));
			document.close();
			writer.close();
			String title = "Invoice - " + cartId;
			dfe = DLFileEntryLocalServiceUtil.fetchFileEntry(user.getGroupId(), 0, title);
			if(Validator.isNotNull(dfe)) {
				DLAppLocalServiceUtil.addFileEntry(
						userId, 
						user.getGroupId(), 
						0, 
						"invoice-" + cartId + ".pdf", 
						"application/pdf", 
						"copy-" + title, 
						"Invoice", 
						null, 
						offer, 
						new ServiceContext());
				DLAppLocalServiceUtil.deleteFileEntry(dfe.getFileEntryId());
			}
			DLAppLocalServiceUtil.addFileEntry(
					userId, 
					user.getGroupId(), 
					0, 
					"invoice-" + cartId + ".pdf", 
					"application/pdf", 
					title, 
					"Offer", 
					null, 
					offer, 
					new ServiceContext());
		}
		return dfe.getFileEntryId();
	}

	@Reference
	private DLAppLocalService _dlAppLocalService;
	
	@Reference
	private DLFileVersionLocalService _dlFileVersionLocalService;
	
	private static final Log _log = LogFactoryUtil.getLog(PdfService.class.getName()); 
}