<template>

    <v-card outlined>
        <v-card-title>
            DeleteDocument
        </v-card-title>

        <v-card-text>
            <string offline label="DocumentId" v-model="value.documentId" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteDocument"
            >
                DeleteDocument
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeleteDocumentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.documentId = {};
        },
        watch: {
        },
        methods: {
            deleteDocument() {
                this.$emit('deleteDocument', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

