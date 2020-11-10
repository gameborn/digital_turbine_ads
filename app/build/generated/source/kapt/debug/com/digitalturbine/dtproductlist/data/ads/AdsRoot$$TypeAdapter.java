package com.digitalturbine.dtproductlist.data.ads;

import com.tickaroo.tikxml.TikXmlConfig;
import com.tickaroo.tikxml.XmlReader;
import com.tickaroo.tikxml.XmlWriter;
import com.tickaroo.tikxml.typeadapter.ChildElementBinder;
import com.tickaroo.tikxml.typeadapter.TypeAdapter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdsRoot$$TypeAdapter implements TypeAdapter<AdsRoot> {
  private Map<String, ChildElementBinder<ValueHolder>> childElementBinders = new  HashMap<String, ChildElementBinder<ValueHolder>>();

  public AdsRoot$$TypeAdapter() {
    childElementBinders.put("totalCampaignsRequested", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.totalCampaignsRequested = reader.nextTextContent();
      }
    });
    childElementBinders.put("ad", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        if (value.ads == null) {
          value.ads = new ArrayList<AdData>();
        }
        value.ads.add((AdData) config.getTypeAdapter(AdData.class).fromXml(reader, config) );
      }
    });
    childElementBinders.put("responseTime", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.responseTime = reader.nextTextContent();
      }
    });
    childElementBinders.put("version", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.version = reader.nextTextContent();
      }
    });
  }

  @Override
  public AdsRoot fromXml(XmlReader reader, TikXmlConfig config) throws IOException {
    ValueHolder value = new ValueHolder();
    while(reader.hasAttribute()) {
      String attributeName = reader.nextAttributeName();
      if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
        throw new IOException("Could not map the xml attribute with the name '"+attributeName+"' at path "+reader.getPath()+" to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
      }
      reader.skipAttributeValue();
    }
    while(true) {
      if (reader.hasElement()) {
        reader.beginElement();
        String elementName = reader.nextElementName();
        ChildElementBinder<ValueHolder> childElementBinder = childElementBinders.get(elementName);
        if (childElementBinder != null) {
          childElementBinder.fromXml(reader, config, value);
          reader.endElement();
        } else if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element with the tag name <" + elementName + "> at path '" + reader.getPath()+"' to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        } else {
          reader.skipRemainingElement();
        }
      } else if (reader.hasTextContent()) {
        if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element's text content at path '"+reader.getPath()+" to java class. Have you annotated such a field in your java class to map the xml element's text content? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        reader.skipTextContent();
      } else {
        break;
      }
    }
    return new AdsRoot(value.ads, value.responseTime, value.totalCampaignsRequested, value.version);
  }

  @Override
  public void toXml(XmlWriter writer, TikXmlConfig config, AdsRoot value,
      String overridingXmlElementTagName) throws IOException {
    if (value != null) {
      if (overridingXmlElementTagName == null) {
        writer.beginElement("adsRoot");
      } else {
        writer.beginElement(overridingXmlElementTagName);
      }
      if (value.getTotalCampaignsRequested() != null) {
        writer.beginElement("totalCampaignsRequested");
        if (value.getTotalCampaignsRequested() != null) {
          writer.textContent(value.getTotalCampaignsRequested());
        }
        writer.endElement();
      }
      if (value.getAds() != null) {
        List<AdData> list = value.getAds();
        int listSize = list.size();
        for (int i =0; i<listSize; i++) {
          AdData item = list.get(i);
          config.getTypeAdapter(AdData.class).toXml(writer, config, item, "ad");
        }
      }
      if (value.getResponseTime() != null) {
        writer.beginElement("responseTime");
        if (value.getResponseTime() != null) {
          writer.textContent(value.getResponseTime());
        }
        writer.endElement();
      }
      if (value.getVersion() != null) {
        writer.beginElement("version");
        if (value.getVersion() != null) {
          writer.textContent(value.getVersion());
        }
        writer.endElement();
      }
      writer.endElement();
    }
  }

  static class ValueHolder {
    List<AdData> ads;

    String responseTime;

    String totalCampaignsRequested;

    String version;
  }
}
