import java.lang.ref.SoftReference;

// $FF: renamed from: hc
public class class_64 extends class_62 {

   // $FF: renamed from: v java.lang.ref.SoftReference
   SoftReference field_483;


   // $FF: renamed from: y () java.lang.Object
   Object method_648() {
      return this.field_483.get();
   }

   // $FF: renamed from: v () java.lang.Object
   Object method_644() {
      return this.field_483.get();
   }

   // $FF: renamed from: <init> (java.lang.Object, int) void
   class_64(Object var1, int var2) {
      super(var2);
      this.field_483 = new SoftReference(var1);
   }

   // $FF: renamed from: f () java.lang.Object
   Object method_651() {
      return this.field_483.get();
   }

   // $FF: renamed from: b () boolean
   boolean method_652() {
      return true;
   }

   // $FF: renamed from: n () boolean
   boolean method_646() {
      return true;
   }

   // $FF: renamed from: p () java.lang.Object
   Object method_649() {
      return this.field_483.get();
   }

   // $FF: renamed from: r () boolean
   boolean method_645() {
      return true;
   }

   // $FF: renamed from: j () java.lang.Object
   Object method_650() {
      return this.field_483.get();
   }
}
