// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.AccountInferredBalance;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.AccountInferredBalanceListParams;

public final class AccountInferredBalanceService extends ApiService {
  public AccountInferredBalanceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public StripeCollection<AccountInferredBalance> list(
      String account, AccountInferredBalanceListParams params) throws StripeException {
    return list(account, params, (RequestOptions) null);
  }
  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public StripeCollection<AccountInferredBalance> list(String account, RequestOptions options)
      throws StripeException {
    return list(account, (AccountInferredBalanceListParams) null, options);
  }
  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public StripeCollection<AccountInferredBalance> list(String account) throws StripeException {
    return list(account, (AccountInferredBalanceListParams) null, (RequestOptions) null);
  }
  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public StripeCollection<AccountInferredBalance> list(
      String account, AccountInferredBalanceListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/inferred_balances",
            ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<AccountInferredBalance>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}