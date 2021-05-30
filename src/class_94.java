
// $FF: renamed from: dr
public final class class_94 extends class_91 {

   // $FF: renamed from: v int
   int field_1022;
   // $FF: renamed from: n int
   int field_1023;
   // $FF: renamed from: ro be
   static class_148 field_1025;

   // $FF: renamed from: n (byte) gr
   protected final class_92 method_1609(byte var1) {
      try {
         return class_299.method_5347(this.field_1022 * -467972035, -1176159180).method_1267(this.field_1023 * 223075527, -293142901);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: p () gr
   protected final class_92 method_1613() {
      return class_299.method_5347(this.field_1022 * -467972035, -1569509030).method_1267(this.field_1023 * -2012309323, -704465197);
   }

   // $FF: renamed from: j () gr
   protected final class_92 method_1608() {
      return class_299.method_5347(this.field_1022 * -467972035, -1032911525).method_1267(this.field_1023 * 223075527, -1783121830);
   }

   // $FF: renamed from: r () gr
   protected final class_92 method_1610() {
      return class_299.method_5347(this.field_1022 * -46280911, -333025042).method_1267(this.field_1023 * -2126215222, 187754579);
   }

   // $FF: renamed from: f (int) void
   static void savePreferences(int var0) {
      try {
         RAFileHandle var1 = null;

         try {
            var1 = class_168.getPreferencesHandle("", class_154.field_1933.field_3347, true, 1832690448);
            Buffer var2 = class_87.preferences.toBuffer(2063389348);
            var1.write(var2.data, 0, var2.offset * -442398587, (byte)-22);
         } catch (Exception var4) {
            ;
         }

         try {
            if(null != var1) {
               if(var0 >= -26460885) {
                  throw new IllegalStateException();
               }

               var1.closeSync(true, 948582110);
            }
         } catch (Exception var3) {
            ;
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }
}
