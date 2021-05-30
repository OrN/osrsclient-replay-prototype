import java.util.Locale;

// $FF: renamed from: kk
public class class_324 implements class_14 {

   // $FF: renamed from: n kk
   static final class_324 field_3812;
   // $FF: renamed from: s int
   final int field_3813;
   // $FF: renamed from: f kk
   public static final class_324 field_3814;
   // $FF: renamed from: v kk
   public static final class_324 field_3815;
   // $FF: renamed from: cn int
   static final int field_3816 = 19;
   // $FF: renamed from: j kk
   public static final class_324 field_3817;
   // $FF: renamed from: p kk
   static final class_324 field_3818;
   // $FF: renamed from: b java.lang.String
   final String field_3819;
   // $FF: renamed from: d java.lang.String
   final String field_3820;
   // $FF: renamed from: u kk[]
   static final class_324[] field_3821;
   // $FF: renamed from: r kk
   static final class_324 field_3822;
   // $FF: renamed from: o int
   static final int field_3823 = 11;
   // $FF: renamed from: y kk
   static final class_324 field_3824;


   // $FF: renamed from: s () java.lang.String
   String method_5762() {
      return this.field_3820;
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, java.lang.String, kl, int, java.lang.String) void
   class_324(String var1, String var2, String var3, class_325 var4, int var5, String var6) {
      super();
      try {
         this.field_3819 = var1;
         this.field_3820 = var2;
         this.field_3813 = var5 * -1443089505;
         if(null != var6) {
            new Locale(var2.substring(0, 2), var6);
         } else {
            new Locale(var2.substring(0, 2));
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "kk.<init>(" + ')');
      }
   }

   // $FF: renamed from: p (byte) java.lang.String
   String method_5764(byte var1) {
      try {
         return this.field_3820;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "kk.p(" + ')');
      }
   }

   public String aci() {
      return this.method_5764((byte)98).toLowerCase(Locale.ENGLISH);
   }

   // $FF: renamed from: l (int) kk
   public static class_324 method_5765(int var0) {
      return var0 >= 0 && var0 < field_3821.length?field_3821[var0]:null;
   }

   public String toString() {
      try {
         return this.method_5764((byte)91).toLowerCase(Locale.ENGLISH);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "kk.toString(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_324 var10000 = new class_324("EN", "en", "English", class_325.field_3825, 0, "GB");
      field_3815 = var10000;
      var10000 = new class_324("DE", "de", "German", class_325.field_3825, 1, "DE");
      field_3812 = var10000;
      var10000 = new class_324("FR", "fr", "French", class_325.field_3825, 2, "FR");
      field_3814 = var10000;
      var10000 = new class_324("PT", "pt", "Portuguese", class_325.field_3825, 3, "BR");
      field_3824 = var10000;
      var10000 = new class_324("NL", "nl", "Dutch", class_325.field_3837, 4, "NL");
      field_3818 = var10000;
      var10000 = new class_324("ES", "es", "Spanish", class_325.field_3837, 5, "ES");
      field_3817 = var10000;
      var10000 = new class_324("ES_MX", "es-mx", "Spanish (Latin American)", class_325.field_3825, 6, "MX");
      field_3822 = var10000;
      class_324[] var0 = method_5768((byte)123);
      field_3821 = new class_324[var0.length];
      class_324[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class_324 var3 = var1[var2];
         if(field_3821[var3.field_3813 * 2108172383] != null) {
            throw new IllegalStateException();
         }

         field_3821[2108172383 * var3.field_3813] = var3;
      }

   }

   // $FF: renamed from: u (int) kk
   public static class_324 method_5767(int var0) {
      return var0 >= 0 && var0 < field_3821.length?field_3821[var0]:null;
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return this.field_3813 * 2108172383;
   }

   public String acv() {
      return this.method_5764((byte)26).toLowerCase(Locale.ENGLISH);
   }

   public String acm() {
      return this.method_5764((byte)49).toLowerCase(Locale.ENGLISH);
   }

   // $FF: renamed from: y (byte) kk[]
   static class_324[] method_5768(byte var0) {
      try {
         return new class_324[]{field_3814, field_3812, field_3822, field_3817, field_3815, field_3818, field_3824};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "kk.y(" + ')');
      }
   }

   public String acx() {
      return this.method_5764((byte)97).toLowerCase(Locale.ENGLISH);
   }

   // $FF: renamed from: r () kk[]
   static class_324[] method_5769() {
      return new class_324[]{field_3814, field_3812, field_3822, field_3817, field_3815, field_3818, field_3824};
   }

   // $FF: renamed from: b () java.lang.String
   String method_5770() {
      return this.field_3820;
   }

   // $FF: renamed from: d () java.lang.String
   String method_5771() {
      return this.field_3820;
   }

   // $FF: renamed from: v (int) int
   public int method_50(int var1) {
      try {
         return this.field_3813 * 2108172383;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "kk.v(" + ')');
      }
   }

   // $FF: renamed from: j (int, byte) kk
   public static class_324 method_5772(int var0, byte var1) {
      try {
         if(var0 >= 0) {
            if(var1 >= 10) {
               throw new IllegalStateException();
            }

            if(var0 < field_3821.length) {
               return field_3821[var0];
            }

            if(var1 >= 10) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "kk.j(" + ')');
      }
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return this.field_3813 * -996387203;
   }

   // $FF: renamed from: o (int) kk
   public static class_324 method_5773(int var0) {
      return var0 >= 0 && var0 < field_3821.length?field_3821[var0]:null;
   }
}
