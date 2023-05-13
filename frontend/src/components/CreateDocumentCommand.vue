<template>

    <v-card outlined>
        <v-card-title>
            CreateDocument
        </v-card-title>

        <v-card-text>
            <string offline label="DocumentName" v-model="value.documentName" :editMode="editMode" @change="change"/>
            <string offline label="DocumentType" v-model="value.documentType" :editMode="editMode" @change="change"/>
            <string offline label="DocumentOwner" v-model="value.documentOwner" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createDocument"
            >
                CreateDocument
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
        name: 'CreateDocumentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.documentName = {};
            this.value.documentType = {};
            this.value.documentOwner = {};
        },
        watch: {
        },
        methods: {
            createDocument() {
                this.$emit('createDocument', this.value);
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

