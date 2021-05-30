
// $FF: renamed from: ha
public class class_256 {

   // $FF: renamed from: n ha
   public static final class_256 field_2888;
   // $FF: renamed from: p ha
   public static final class_256 field_2889;
   // $FF: renamed from: f ha
   public static final class_256 field_2890;
   // $FF: renamed from: y ha
   public static final class_256 field_2891;
   // $FF: renamed from: b ha
   public static final class_256 field_2892;
   // $FF: renamed from: j ha
   public static final class_256 field_2893;
   // $FF: renamed from: v ha
   public static final class_256 field_2894;
   // $FF: renamed from: r ha
   public static final class_256 field_2895;
   // $FF: renamed from: d ha
   public static final class_256 field_2896;
   // $FF: renamed from: s ha
   public static final class_256 field_2897;


   // $FF: renamed from: f () ha[]
   public static class_256[] method_4943() {
      return new class_256[]{field_2894, field_2888, field_2890, field_2891, field_2889, field_2893, field_2895, field_2892, field_2896, field_2897};
   }

   // $FF: renamed from: ia (int, int, int, int, int, int, int, int, byte) void
   static final void method_4944(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if(!class_191.method_3957(var0, (byte)-76)) {
            if(var8 == 4) {
               throw new IllegalStateException();
            } else {
               if(-1 != var7) {
                  if(var8 == 4) {
                     throw new IllegalStateException();
                  }

                  client.field_1495[var7] = true;
               } else {
                  for(int var9 = 0; var9 < 100; ++var9) {
                     if(var8 == 4) {
                        throw new IllegalStateException();
                     }

                     client.field_1495[var9] = true;
                  }
               }

            }
         } else {
            class_117.field_1306 = null;
            class_329.method_5865(class_37.field_93[var0], -1, var1, var2, var3, var4, var5, var6, var7, -1945038256);
            if(null != class_117.field_1306) {
               if(var8 == 4) {
                  throw new IllegalStateException();
               }

               class_329.method_5865(class_117.field_1306, -1412584499, var1, var2, var3, var4, class_44.field_328 * -217468963, class_168.field_2102 * -1942533771, var7, -1945038256);
               class_117.field_1306 = null;
            }

         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "ha.ia(" + ')');
      }
   }

   // $FF: renamed from: n () ha[]
   public static class_256[] method_4945() {
      return new class_256[]{field_2894, field_2888, field_2890, field_2891, field_2889, field_2893, field_2895, field_2892, field_2896, field_2897};
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_256 var10000 = new class_256(15);
      field_2894 = var10000;
      var10000 = new class_256(7);
      field_2888 = var10000;
      var10000 = new class_256(2);
      field_2890 = var10000;
      var10000 = new class_256(5);
      field_2891 = var10000;
      var10000 = new class_256(14);
      field_2889 = var10000;
      var10000 = new class_256(3);
      field_2893 = var10000;
      var10000 = new class_256(5);
      field_2895 = var10000;
      var10000 = new class_256(4);
      field_2892 = var10000;
      var10000 = new class_256(4);
      field_2896 = var10000;
      var10000 = new class_256(6);
      field_2897 = var10000;
   }

   // $FF: renamed from: <init> (int) void
   class_256(int var1) {
      super();
      try {
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ha.<init>(" + ')');
      }
   }
}
