package com.digitalturbine.dtproductlist.data.ads;

import com.tickaroo.tikxml.TikXmlConfig;
import com.tickaroo.tikxml.XmlReader;
import com.tickaroo.tikxml.XmlWriter;
import com.tickaroo.tikxml.typeadapter.AttributeBinder;
import com.tickaroo.tikxml.typeadapter.TypeAdapter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class ExternalMeta$$TypeAdapter implements TypeAdapter<ExternalMeta> {
  private Map<String, AttributeBinder<ValueHolder>> attributeBinders = new  HashMap<String, AttributeBinder<ValueHolder>>();

  public ExternalMeta$$TypeAdapter() {
    attributeBinders.put("xsi:nil", new AttributeBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.external2 = reader.nextAttributeValueAsBoolean();
      }
    });
    attributeBinders.put("xmlns:xsi", new AttributeBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.external1 = reader.nextAttributeValue();
      }
    });
  }

  @Override
  public ExternalMeta fromXml(XmlReader reader, TikXmlConfig config) throws IOException {
    ValueHolder value = new ValueHolder();
    while(reader.hasAttribute()) {
      String attributeName = reader.nextAttributeName();
      AttributeBinder<ValueHolder> attributeBinder = attributeBinders.get(attributeName);
      if (attributeBinder != null) {
        attributeBinder.fromXml(reader, config, value);
      } else {
        if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
          throw new IOException("Could not map the xml attribute with the name '"+attributeName+"' at path "+reader.getPath()+" to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        reader.skipAttributeValue();
      }
    }
    while (reader.hasElement() || reader.hasTextContent()) {
      if (reader.hasElement()) {
        if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element with the tag name '"+reader.nextElementName()+"' at path "+reader.getPath()+" to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        while(reader.hasElement()) {
          reader.beginElement();
          reader.skipRemainingElement();
        }
      } else if (reader.hasTextContent()) {
        if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element's text content at path '"+reader.getPath()+" to java class. Have you annotated such a field in your java class to map the xml element's text content? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        reader.skipTextContent();
      }
    }
    return new ExternalMeta(value.external1, value.external2);
  }

  @Override
  public void toXml(XmlWriter writer, TikXmlConfig config, ExternalMeta value,
      String overridingXmlElementTagName) throws IOException {
    if (value != null) {
      if (overridingXmlElementTagName == null) {
        writer.beginElement("externalMetadata");
      } else {
        writer.beginElement(overridingXmlElementTagName);
      }
      writer.attribute("xsi:nil", value.getExternal2());
      if (value.getExternal1() != null) {
        writer.attribute("xmlns:xsi", value.getExternal1());
      }
      writer.endElement();
    }
  }

  static class ValueHolder {
    String external1;

    boolean external2;
  }
}
