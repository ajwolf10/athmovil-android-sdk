package com.evertecinc.athmovil.sdk.checkout.objects;

import android.app.Application;

public class PaymentResultFlag extends Application {

    public PaymentResultFlag() {
        super();
    }

    private static PaymentResultFlag applicationInstance = new PaymentResultFlag();

    public static PaymentResultFlag getApplicationInstance() {
        return applicationInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationInstance = this;
    }

    private ATHMPayment paymentRequest = null;

    private String schemeForNR = null;

    public String getSchemeForNR() {
        return schemeForNR;
    }

    public void setSchemeForNR(String schemeForNR) {
        this.schemeForNR = schemeForNR;
    }

    public static void setApplicationInstance(PaymentResultFlag applicationInstance) {
        PaymentResultFlag.applicationInstance = applicationInstance;
    }

    public ATHMPayment getPaymentRequest() {
        return paymentRequest;
    }

    public void setPaymentRequest(ATHMPayment paymentRequest) {
        this.paymentRequest = paymentRequest;
    }
}

