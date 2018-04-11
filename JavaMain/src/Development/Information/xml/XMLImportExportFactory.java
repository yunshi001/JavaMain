package Development.Information.xml;

public class XMLImportExportFactory {
	public static enum XML_FACTORY_TYPE {
		ATM, LSC, MACRO, NETWORK, OFFSET;
	}

	public static AbstractXMLImporter getImporter(XML_FACTORY_TYPE type) {
		switch (type) {
		case ATM:

		case LSC:

		case MACRO:

		case NETWORK:

		case OFFSET:

		}
		return null;
	}

	public static AbstractXMLExporter getExporter(XML_FACTORY_TYPE type) {
		switch (type) {
		case ATM:

		case LSC:

		case MACRO:

		case NETWORK:

		case OFFSET:
			return OffsetXMLExporter.getInstance();
		}
		return null;
	}
}
