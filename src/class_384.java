
// $FF: renamed from: no
final class class_384 implements class_23 {

   // $FF: renamed from: hd int
   static final int field_4212 = 334;
   // $FF: renamed from: bg int
   static final int field_4213 = 7;


   // $FF: renamed from: f (java.lang.Object, nd) void
   public void method_71(Object var1, Buffer var2) {
      this.method_6702((Integer)var1, var2);
   }

   // $FF: renamed from: b (java.lang.Integer, nd, byte) void
   void method_6702(Integer var1, Buffer var2) {
      try {
         var2.writeIntReverse(var1.intValue());
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (nd, int) java.lang.Object
   public Object method_75(Buffer var1) {
      try {
         return Integer.valueOf(var1.readInt());
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: d (java.lang.Integer, nd) void
   void method_6703(Integer var1, Buffer var2) {
      var2.writeIntReverse(var1.intValue());
   }

   // $FF: renamed from: <init> () void
   class_384() {
      super();
   }

   // $FF: renamed from: y (java.lang.Object, nd) void
   public void method_72(Object var1, Buffer var2) {
      this.method_6702((Integer)var1, var2);
   }

   // $FF: renamed from: p (nd) java.lang.Object
   public Object method_70(Buffer var1) {
      return Integer.valueOf(var1.readInt());
   }

   // $FF: renamed from: j (nd) java.lang.Object
   public Object method_69(Buffer var1) {
      return Integer.valueOf(var1.readInt());
   }

   // $FF: renamed from: r (nd) java.lang.Object
   public Object method_74(Buffer var1) {
      return Integer.valueOf(var1.readInt());
   }

   // $FF: renamed from: v (java.lang.Object, nd, int) void
   public void method_73(Object var1, Buffer var2) {
      try {
         this.method_6702((Integer)var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: s (java.lang.Integer, nd) void
   void method_6705(Integer var1, Buffer var2) {
      var2.writeIntReverse(var1.intValue());
   }

   // $FF: renamed from: u (java.lang.Integer, nd) void
   void method_6706(Integer var1, Buffer var2) {
      var2.writeIntReverse(var1.intValue());
   }

   // $FF: renamed from: l (java.lang.Integer, nd) void
   void method_6707(Integer var1, Buffer var2) {
      var2.writeIntReverse(var1.intValue());
   }
}
