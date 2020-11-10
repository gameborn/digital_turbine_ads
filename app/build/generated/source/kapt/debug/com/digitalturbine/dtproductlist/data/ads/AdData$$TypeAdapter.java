package com.digitalturbine.dtproductlist.data.ads;

import com.tickaroo.tikxml.TikXmlConfig;
import com.tickaroo.tikxml.XmlReader;
import com.tickaroo.tikxml.XmlWriter;
import com.tickaroo.tikxml.typeadapter.ChildElementBinder;
import com.tickaroo.tikxml.typeadapter.TypeAdapter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class AdData$$TypeAdapter implements TypeAdapter<AdData> {
  private Map<String, ChildElementBinder<ValueHolder>> childElementBinders = new  HashMap<String, ChildElementBinder<ValueHolder>>();

  public AdData$$TypeAdapter() {
    childElementBinders.put("averageRatingImageURL", new ChildElementBinder<ValueHolder>() {
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
        value.avgRatingImgURL = reader.nextTextContent();
      }
    });
    childElementBinders.put("isRandomPick", new ChildElementBinder<ValueHolder>() {
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
        value.isRandomPick = reader.nextTextContentAsBoolean();
      }
    });
    childElementBinders.put("clickProxyURL", new ChildElementBinder<ValueHolder>() {
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
        value.clickProxyURL = reader.nextTextContent();
      }
    });
    childElementBinders.put("numberOfDownloads", new ChildElementBinder<ValueHolder>() {
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
        value.numberOfDownloads = reader.nextTextContent();
      }
    });
    childElementBinders.put("tstiEligible", new ChildElementBinder<ValueHolder>() {
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
        value.tstiEligible = reader.nextTextContentAsBoolean();
      }
    });
    childElementBinders.put("rating", new ChildElementBinder<ValueHolder>() {
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
        value.rating = reader.nextTextContent();
      }
    });
    childElementBinders.put("bidRate", new ChildElementBinder<ValueHolder>() {
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
        value.bidRate = reader.nextTextContent();
      }
    });
    childElementBinders.put("categoryName", new ChildElementBinder<ValueHolder>() {
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
        value.categoryName = reader.nextTextContent();
      }
    });
    childElementBinders.put("creativeId", new ChildElementBinder<ValueHolder>() {
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
        value.creativeId = reader.nextTextContent();
      }
    });
    childElementBinders.put("productName", new ChildElementBinder<ValueHolder>() {
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
        value.productName = reader.nextTextContent();
      }
    });
    childElementBinders.put("minOSVersion", new ChildElementBinder<ValueHolder>() {
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
        value.minOSVersion = reader.nextTextContent();
      }
    });
    childElementBinders.put("callToAction", new ChildElementBinder<ValueHolder>() {
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
        value.callToAction = reader.nextTextContent();
      }
    });
    childElementBinders.put("campaignDisplayOrder", new ChildElementBinder<ValueHolder>() {
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
        value.campaignDisplayOrder = reader.nextTextContent();
      }
    });
    childElementBinders.put("appId", new ChildElementBinder<ValueHolder>() {
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
        value.appPackageId = reader.nextTextContent();
      }
    });
    childElementBinders.put("numberOfRatings", new ChildElementBinder<ValueHolder>() {
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
        value.numberOfRatings = reader.nextTextContent();
      }
    });
    childElementBinders.put("campaignTypeId", new ChildElementBinder<ValueHolder>() {
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
        value.campaignTypeId = reader.nextTextContent();
      }
    });
    childElementBinders.put("stiEnabled", new ChildElementBinder<ValueHolder>() {
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
        value.stiEnabled = reader.nextTextContentAsBoolean();
      }
    });
    childElementBinders.put("productDescription", new ChildElementBinder<ValueHolder>() {
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
        value.productDescription = reader.nextTextContent();
      }
    });
    childElementBinders.put("productId", new ChildElementBinder<ValueHolder>() {
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
        value.productId = reader.nextTextContent();
      }
    });
    childElementBinders.put("campaignId", new ChildElementBinder<ValueHolder>() {
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
        value.campaignId = reader.nextTextContent();
      }
    });
    childElementBinders.put("appPrivacyPolicyUrl", new ChildElementBinder<ValueHolder>() {
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
        value.appPrivacyPolicyUrl = reader.nextTextContent();
      }
    });
    childElementBinders.put("externalMetadata", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.externalMetadata = config.getTypeAdapter(ExternalMeta.class).fromXml(reader, config);
      }
    });
    childElementBinders.put("homeScreen", new ChildElementBinder<ValueHolder>() {
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
        value.homeScreen = reader.nextTextContentAsBoolean();
      }
    });
    childElementBinders.put("impressionTrackingURL", new ChildElementBinder<ValueHolder>() {
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
        value.impressionTrackingURL = reader.nextTextContent();
      }
    });
    childElementBinders.put("postInstallActions", new ChildElementBinder<ValueHolder>() {
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
        value.postInstallActions = reader.nextTextContent();
      }
    });
    childElementBinders.put("billingTypeId", new ChildElementBinder<ValueHolder>() {
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
        value.billingTypeId = reader.nextTextContent();
      }
    });
    childElementBinders.put("productThumbnail", new ChildElementBinder<ValueHolder>() {
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
        value.productThumbnail = reader.nextTextContent();
      }
    });
  }

  @Override
  public AdData fromXml(XmlReader reader, TikXmlConfig config) throws IOException {
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
    return new AdData(value.appPackageId, value.avgRatingImgURL, value.bidRate, value.billingTypeId, value.callToAction, value.campaignDisplayOrder, value.campaignId, value.campaignTypeId, value.categoryName, value.clickProxyURL, value.creativeId, value.homeScreen, value.isRandomPick, value.numberOfRatings, value.productDescription, value.productId, value.productName, value.productThumbnail, value.rating, value.numberOfDownloads, value.tstiEligible, value.stiEnabled, value.impressionTrackingURL, value.minOSVersion, value.appPrivacyPolicyUrl, value.externalMetadata, value.postInstallActions);
  }

  @Override
  public void toXml(XmlWriter writer, TikXmlConfig config, AdData value,
      String overridingXmlElementTagName) throws IOException {
    if (value != null) {
      if (overridingXmlElementTagName == null) {
        writer.beginElement("ad");
      } else {
        writer.beginElement(overridingXmlElementTagName);
      }
      if (value.getAvgRatingImgURL() != null) {
        writer.beginElement("averageRatingImageURL");
        if (value.getAvgRatingImgURL() != null) {
          writer.textContent(value.getAvgRatingImgURL());
        }
        writer.endElement();
      }
      writer.beginElement("isRandomPick");
      writer.textContent(value.isRandomPick());
      writer.endElement();
      if (value.getClickProxyURL() != null) {
        writer.beginElement("clickProxyURL");
        if (value.getClickProxyURL() != null) {
          writer.textContent(value.getClickProxyURL());
        }
        writer.endElement();
      }
      if (value.getNumberOfDownloads() != null) {
        writer.beginElement("numberOfDownloads");
        if (value.getNumberOfDownloads() != null) {
          writer.textContent(value.getNumberOfDownloads());
        }
        writer.endElement();
      }
      writer.beginElement("tstiEligible");
      writer.textContent(value.getTstiEligible());
      writer.endElement();
      if (value.getRating() != null) {
        writer.beginElement("rating");
        if (value.getRating() != null) {
          writer.textContent(value.getRating());
        }
        writer.endElement();
      }
      if (value.getBidRate() != null) {
        writer.beginElement("bidRate");
        if (value.getBidRate() != null) {
          writer.textContent(value.getBidRate());
        }
        writer.endElement();
      }
      if (value.getCategoryName() != null) {
        writer.beginElement("categoryName");
        if (value.getCategoryName() != null) {
          writer.textContent(value.getCategoryName());
        }
        writer.endElement();
      }
      if (value.getCreativeId() != null) {
        writer.beginElement("creativeId");
        if (value.getCreativeId() != null) {
          writer.textContent(value.getCreativeId());
        }
        writer.endElement();
      }
      if (value.getProductName() != null) {
        writer.beginElement("productName");
        if (value.getProductName() != null) {
          writer.textContent(value.getProductName());
        }
        writer.endElement();
      }
      if (value.getMinOSVersion() != null) {
        writer.beginElement("minOSVersion");
        if (value.getMinOSVersion() != null) {
          writer.textContent(value.getMinOSVersion());
        }
        writer.endElement();
      }
      if (value.getCallToAction() != null) {
        writer.beginElement("callToAction");
        if (value.getCallToAction() != null) {
          writer.textContent(value.getCallToAction());
        }
        writer.endElement();
      }
      if (value.getCampaignDisplayOrder() != null) {
        writer.beginElement("campaignDisplayOrder");
        if (value.getCampaignDisplayOrder() != null) {
          writer.textContent(value.getCampaignDisplayOrder());
        }
        writer.endElement();
      }
      if (value.getAppPackageId() != null) {
        writer.beginElement("appId");
        if (value.getAppPackageId() != null) {
          writer.textContent(value.getAppPackageId());
        }
        writer.endElement();
      }
      if (value.getNumberOfRatings() != null) {
        writer.beginElement("numberOfRatings");
        if (value.getNumberOfRatings() != null) {
          writer.textContent(value.getNumberOfRatings());
        }
        writer.endElement();
      }
      if (value.getCampaignTypeId() != null) {
        writer.beginElement("campaignTypeId");
        if (value.getCampaignTypeId() != null) {
          writer.textContent(value.getCampaignTypeId());
        }
        writer.endElement();
      }
      writer.beginElement("stiEnabled");
      writer.textContent(value.getStiEnabled());
      writer.endElement();
      if (value.getProductDescription() != null) {
        writer.beginElement("productDescription");
        if (value.getProductDescription() != null) {
          writer.textContent(value.getProductDescription());
        }
        writer.endElement();
      }
      if (value.getProductId() != null) {
        writer.beginElement("productId");
        if (value.getProductId() != null) {
          writer.textContent(value.getProductId());
        }
        writer.endElement();
      }
      if (value.getCampaignId() != null) {
        writer.beginElement("campaignId");
        if (value.getCampaignId() != null) {
          writer.textContent(value.getCampaignId());
        }
        writer.endElement();
      }
      if (value.getAppPrivacyPolicyUrl() != null) {
        writer.beginElement("appPrivacyPolicyUrl");
        if (value.getAppPrivacyPolicyUrl() != null) {
          writer.textContent(value.getAppPrivacyPolicyUrl());
        }
        writer.endElement();
      }
      if (value.getExternalMetadata() != null) {
        config.getTypeAdapter(ExternalMeta.class).toXml(writer, config, value.getExternalMetadata(), "externalMetadata");
      }
      writer.beginElement("homeScreen");
      writer.textContent(value.getHomeScreen());
      writer.endElement();
      if (value.getImpressionTrackingURL() != null) {
        writer.beginElement("impressionTrackingURL");
        if (value.getImpressionTrackingURL() != null) {
          writer.textContent(value.getImpressionTrackingURL());
        }
        writer.endElement();
      }
      if (value.getPostInstallActions() != null) {
        writer.beginElement("postInstallActions");
        if (value.getPostInstallActions() != null) {
          writer.textContent(value.getPostInstallActions());
        }
        writer.endElement();
      }
      if (value.getBillingTypeId() != null) {
        writer.beginElement("billingTypeId");
        if (value.getBillingTypeId() != null) {
          writer.textContent(value.getBillingTypeId());
        }
        writer.endElement();
      }
      if (value.getProductThumbnail() != null) {
        writer.beginElement("productThumbnail");
        if (value.getProductThumbnail() != null) {
          writer.textContent(value.getProductThumbnail());
        }
        writer.endElement();
      }
      writer.endElement();
    }
  }

  static class ValueHolder {
    String appPackageId;

    String avgRatingImgURL;

    String bidRate;

    String billingTypeId;

    String callToAction;

    String campaignDisplayOrder;

    String campaignId;

    String campaignTypeId;

    String categoryName;

    String clickProxyURL;

    String creativeId;

    boolean homeScreen;

    boolean isRandomPick;

    String numberOfRatings;

    String productDescription;

    String productId;

    String productName;

    String productThumbnail;

    String rating;

    String numberOfDownloads;

    boolean tstiEligible;

    boolean stiEnabled;

    String impressionTrackingURL;

    String minOSVersion;

    String appPrivacyPolicyUrl;

    ExternalMeta externalMetadata;

    String postInstallActions;
  }
}
