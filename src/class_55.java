
// $FF: renamed from: i
public class class_55 extends class_51 {

   // $FF: renamed from: n byte
   byte field_410;
   // $FF: renamed from: bh op[]
   static class_66[] field_411;
   // $FF: renamed from: y java.lang.String
   String field_412;
   // $FF: renamed from: v int
   int field_413;
   // $FF: synthetic field
   final class_180 this$0;
   // $FF: renamed from: f int
   int field_414;
   // $FF: renamed from: ai int
   static final int field_415 = 33;
   // $FF: renamed from: bn int
   static final int field_416 = 1;


   // $FF: renamed from: y (y) void
   void method_568(class_44 var1) {
      class_178 var2 = (class_178)var1.field_318.get(this.field_413 * -1119027669);
      var2.field_2221 = this.field_410;
      var2.field_2217 = 642799866 * this.field_414;
      var2.field_2222 = this.field_412;
   }

   // $FF: renamed from: <init> (x) void
   class_55(class_180 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_413 = 188362621;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (y, int) void
   void method_569(class_44 var1, int var2) {
      try {
         class_178 var3 = (class_178)var1.field_318.get(this.field_413 * -1119027669);
         var3.field_2221 = this.field_410;
         var3.field_2217 = -477285015 * this.field_414;
         var3.field_2222 = this.field_412;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_570(Buffer var1) {
      var1.readUnsignedByte();
      this.field_413 = var1.readShort() * -2127816187;
      this.field_410 = var1.readByte();
      this.field_414 = var1.readShort() * -827329295;
      var1.readLong();
      this.field_412 = var1.method_139(-391631059);
      var1.readUnsignedByte();
   }

   // $FF: renamed from: v (nd, int) void
   void method_571(Buffer var1, int var2) {
      try {
         var1.readUnsignedByte();
         this.field_413 = var1.readShort() * -188362621;
         this.field_410 = var1.readByte();
         this.field_414 = var1.readShort() * -827329295;
         var1.readLong();
         this.field_412 = var1.method_139(-391631059);
         var1.readUnsignedByte();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
