package Development.Information.xml;

import javax.xml.stream.XMLStreamException;

public class OffsetXMLExporter extends AbstractXMLExporter {

	private static OffsetXMLExporter INSTANCE;

	public static OffsetXMLExporter getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new OffsetXMLExporter();
		}
		return INSTANCE;
	}

	private OffsetXMLExporter() {

	}

	protected void saveAsXML(String paramString) throws XMLStreamException {
		this.writer.setIndentStep("     ");
		this.writer.writeStartDocument();
		this.writer.writeStartElement(AbstractXMLExporter.XML_STRINGS.TOOL_OFFSET.toString());
		writeLengthsAndWear();
		this.writer.writeStartElement(AbstractXMLExporter.XML_STRINGS.WORK_ZERO_OFFSET.toString());
		writeWorkOffsets();
		this.writer.writeStartElement(AbstractXMLExporter.XML_STRINGS.POCKETS_AND_TOOLS.toString());
		writePocketOffsets();
		this.writer.writeCharacters("\n");

	}

	private void writeLengthsAndWear() throws XMLStreamException {
		int maxTools = 200;
		this.writer.writeStartElement(AbstractXMLExporter.XML_STRINGS.LENGTH_AND_WEAR.toString());
		for (int i = 1; i <= maxTools; i++) {
			this.writer.writeStartElement(AbstractXMLExporter.XML_STRINGS.TOOL.toString() + i);
			for (int j = 2; j < 8; j++) {
				writeElement(i, this.xmlStrings[j]);
			}
			this.writer.writeEndElement();
		}
		this.writer.writeEndElement();
	}

	protected void writeElement(int index, AbstractXMLExporter.XML_STRINGS type) throws XMLStreamException {
		this.writer.writeStartElement(type.toString());
		

	}

	private void writeWorkOffsets() throws XMLStreamException {


	}

	private void writePocketOffsets() throws XMLStreamException {

	}
}
