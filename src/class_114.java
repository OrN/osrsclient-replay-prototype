
// $FF: renamed from: u
public class class_114 extends class_111 {

   // $FF: renamed from: v int
   int field_1282;
   // $FF: synthetic field
   final class_167 this$0;
    // $FF: renamed from: gc op[]
   static class_66[] field_1284;
   // $FF: renamed from: sl my
   static class_30 field_1285;


    // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         this.field_1282 = var1.readShort() * 46229643;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3677(-91373789 * this.field_1282, -736168381);
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3677(-91373789 * this.field_1282, 618378761);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      this.field_1282 = var1.readShort() * 46229643;
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      this.field_1282 = var1.readShort() * -1044229845;
   }

   // $FF: renamed from: <init> (f) void
   class_114(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1282 = -46229643;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
