import java.net.URL;

// $FF: renamed from: df
public class class_194 {

   // $FF: renamed from: az int
   public static final int field_2302 = 48;
   // $FF: renamed from: n boolean
   volatile boolean field_2303;
   // $FF: renamed from: f byte[]
   volatile byte[] field_2304;
   // $FF: renamed from: v java.net.URL
   final URL url;
   // $FF: renamed from: dn jp
   static IDXFile idx6;


   // $FF: renamed from: n (byte) byte[]
   public byte[] method_3961() {
      try {
         return this.field_2304;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> (java.net.URL) void
   class_194(URL var1) {
      super();
      try {
         this.url = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (int) boolean
   public boolean method_3963() {
      try {
         return this.field_2303;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f () boolean
   public boolean method_3964() {
      return this.field_2303;
   }

   // $FF: renamed from: y () byte[]
   public byte[] method_3965() {
      return this.field_2304;
   }
}
