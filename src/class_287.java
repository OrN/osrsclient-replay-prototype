
// $FF: renamed from: iu
public class class_287 {

   // $FF: renamed from: lb int
   static int field_3277;
   // $FF: renamed from: tz mc
   static class_363 field_3278;


   // $FF: renamed from: v (int) void
   static void method_5276(int var0) {
      try {
         if(class_201.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            if(var0 != 754026835) {
               throw new IllegalStateException();
            }

            class_145.field_1852[186] = 57;
            class_145.field_1852[187] = 27;
            class_145.field_1852[188] = 71;
            class_145.field_1852[189] = 26;
            class_145.field_1852[190] = 72;
            class_145.field_1852[191] = 73;
            class_145.field_1852[192] = 58;
            class_145.field_1852[219] = 42;
            class_145.field_1852[220] = 74;
            class_145.field_1852[221] = 43;
            class_145.field_1852[222] = 59;
            class_145.field_1852[223] = 28;
         } else {
            class_145.field_1852[44] = 71;
            class_145.field_1852[45] = 26;
            class_145.field_1852[46] = 72;
            class_145.field_1852[47] = 73;
            class_145.field_1852[59] = 57;
            class_145.field_1852[61] = 27;
            class_145.field_1852[91] = 42;
            class_145.field_1852[92] = 74;
            class_145.field_1852[93] = 43;
            class_145.field_1852[192] = 28;
            class_145.field_1852[222] = 58;
            class_145.field_1852[520] = 59;
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "iu.v(" + ')');
      }
   }

   // $FF: renamed from: f (int, int, int) int
   public static int method_5277(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }

   // $FF: renamed from: y (int, int, int) int
   public static int method_5278(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }

   // $FF: renamed from: p (int, int, int, int, int, int) int
   public static int method_5279(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0 - (var3 - 1):(2 == var2?7 - var1 - (var4 - 1):var0));
   }

   // $FF: renamed from: <init> () void
   class_287() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "iu.<init>(" + ')');
      }
   }
}
