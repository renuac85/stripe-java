// File generated from our OpenAPI spec
package com.stripe.param.entitlements;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class FeatureCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> A unique key you provide as your own system identifier. This may be
   * up to 80 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * <strong>Required.</strong> The feature's name, for your own purpose, not meant to be
   * displayable to the customer.
   */
  @SerializedName("name")
  String name;

  /** Contains information about type=quantity features. This is required when type=quantity. */
  @SerializedName("quantity")
  Quantity quantity;

  /** <strong>Required.</strong> The type of feature. */
  @SerializedName("type")
  Type type;

  private FeatureCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      String lookupKey,
      String name,
      Quantity quantity,
      Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.name = name;
    this.quantity = quantity;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private String name;

    private Quantity quantity;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public FeatureCreateParams build() {
      return new FeatureCreateParams(
          this.expand, this.extraParams, this.lookupKey, this.name, this.quantity, this.type);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FeatureCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FeatureCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FeatureCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link FeatureCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> A unique key you provide as your own system identifier. This may
     * be up to 80 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * <strong>Required.</strong> The feature's name, for your own purpose, not meant to be
     * displayable to the customer.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Contains information about type=quantity features. This is required when type=quantity. */
    public Builder setQuantity(FeatureCreateParams.Quantity quantity) {
      this.quantity = quantity;
      return this;
    }

    /** <strong>Required.</strong> The type of feature. */
    public Builder setType(FeatureCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class Quantity {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The quantity of units made available by this feature. This
     * quantity will be multiplied by the line_item quantity for line_items that contain this
     * feature.
     */
    @SerializedName("units_available")
    Long unitsAvailable;

    private Quantity(Map<String, Object> extraParams, Long unitsAvailable) {
      this.extraParams = extraParams;
      this.unitsAvailable = unitsAvailable;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long unitsAvailable;

      /** Finalize and obtain parameter instance from this builder. */
      public FeatureCreateParams.Quantity build() {
        return new FeatureCreateParams.Quantity(this.extraParams, this.unitsAvailable);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FeatureCreateParams.Quantity#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link FeatureCreateParams.Quantity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The quantity of units made available by this feature. This
       * quantity will be multiplied by the line_item quantity for line_items that contain this
       * feature.
       */
      public Builder setUnitsAvailable(Long unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("quantity")
    QUANTITY("quantity"),

    @SerializedName("switch")
    SWITCH("switch");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}